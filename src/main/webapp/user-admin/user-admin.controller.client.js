(function () {
    let $usernameFld, $passwordFld;
    let $firstNameFld, $lastNameFld, $roleFld;
    let $removeBtn, $editBtn, $createBtn;
    let $updateBtn;
    let $tbody;
    let userService = new AdminUserServiceClient();
    let users = [];
    let selectedUser;
    $(main);

    function main() {
        $usernameFld = $("#usernameFld")
        $passwordFld = $("#passwordFld")
        $firstNameFld = $("#firstNameFld")
        $lastNameFld = $("#lastNameFld")
        $roleFld = $("#roleFld")
        $createBtn = $(".wbdv-create")
        $removeBtn = $(".wbdv-remove")
        $updateBtn = $(".wbdv-update")
        $editBtn = $(".wbdv-edit")
        $tbody = $("tbody")

        $updateBtn.click(updateUser)
        $createBtn.click(() => {
                createUser({
                    username: $usernameFld.val(),
                    password: $passwordFld.val(),
                    firstName: $firstNameFld.val(),
                    lastName: $lastNameFld.val(),
                    role: $roleFld.val()
                })
                $usernameFld.val('')
                $passwordFld.val('')
                $firstNameFld.val('')
                $lastNameFld.val('')
            }
        )

        userService.findAllUsers()
            .then(function (actualUsersFromServer) {
                users = actualUsersFromServer
                renderUsers(users)
            })
    }

    function createUser(user) {
        userService.createUser(user)
            .then(function (actualUser) {
                users.push(actualUser)
                renderUsers(users)
            })
    }

    function deleteUser(event) {
        let deleteBtn = $(event.target)
        let userIndex = deleteBtn.attr("id")
        let userId = users[userIndex]._id

        userService.deleteUser(userId)
            .then(function (status) {
                users.splice(userIndex, 1)
                renderUsers(users)
            })
    }

    function selectUser(event) {
        let selectBtn = $(event.target)
        let userIndex = selectBtn.attr("id")
        selectedUser = users.find(user => user._id === userIndex)
        $usernameFld.val(selectedUser.username)
        $passwordFld.val(selectedUser.password)
        $firstNameFld.val(selectedUser.firstName)
        $lastNameFld.val(selectedUser.lastName)
        $roleFld.val(selectedUser.role)
    }

    function updateUser() {
        selectedUser.username = $usernameFld.val()
        selectedUser.password = $passwordFld.val()
        selectedUser.firstName = $firstNameFld.val()
        selectedUser.lastName = $lastNameFld.val()
        selectedUser.role = $roleFld.val()

        userService.updateUser(selectedUser._id, selectedUser)
            .then(function (status) {
                let index = users.findIndex(user => user._id === selectedUser._id)
                users[index] = selectedUser
                renderUsers(users)
            })
    }

    function renderUsers(users) {
        $tbody.empty()
        for (let i = 0; i < users.length; i++) {
            let user = users[i]
            $tbody.prepend(`
                <tr class="wbdv-template wbdv-user wbdv-hidden">
                  <td class="wbdv-username">${user.username}</td>
                  <td>&nbsp;</td>
                  <td class="wbdv-first-name">${user.firstName}</td>
                  <td class="wbdv-last-name">${user.lastName}</td>
                  <td class="wbdv-role">${user.role}</td>
                  <td class="wbdv-actions">
                    <span class="pull-right">
                      <i class="fa-2x fa fa-times wbdv-remove" id="${i}"></i>
                      <i class="fa-2x fa fa-pencil wbdv-edit" id="${user._id}"></i>
                    </span>
                  </td>
                </tr>
            `)
        }
        $(".wbdv-remove")
            .click(deleteUser)
        $(".wbdv-edit")
            .click(selectUser)
    }
})();





