<#import "../parts/layout.ftl" as c>

<script src="/static/js/directory/authors_directory.js" defer></script>

<@c.page>

<h2>${name}</h2>

<button class="btn btn-primary mb-3 directory_edit" data-toggle="modal" data-target="#editModal" data-id="0">Create</button>

<table data-toggle="table">
    <thead>
    <tr>
        <th data-width="100">Id</th>
        <th>Last Name</th>
        <th>First Name</th>
        <th>Middle Name</th>
        <th data-width="100">Edit</th>
        <th data-width="100">Delete</th>
    </tr>
    </thead>
    <tbody>
    <#list directories as directory>
    <tr>
        <td>${directory.id}</td>
        <td id="last_name_${directory.id}">${directory.lastName!''}</td>
        <td id="first_name_${directory.id}">${directory.firstName!''}</td>
        <td id="middle_name_${directory.id}">${directory.middleName!''}</td>
        <td>
            <button class="btn btn-success directory_edit" data-toggle="modal" data-target="#editModal" data-id="${directory.id}">Edit</button>
        </td>
        <td>
            <a href="/directory/${path}/delete/${directory.id}" class="btn btn-danger">Delete</a>
        </td>
    </tr>
    </#list>
    </tbody>
</table>

<div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="editModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="editModalLabel">Edit genre</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <input type="hidden" id="id">
                    <div class="form-group">
                        <label for="last_name" class="col-form-label">Last Name:</label>
                        <input type="text" class="form-control" id="last_name">
                    </div>
                    <div class="form-group">
                        <label for="first_name" class="col-form-label">First Name:</label>
                        <input type="text" class="form-control" id="first_name">
                    </div>
                    <div class="form-group">
                        <label for="middle_name" class="col-form-label">Middle Name:</label>
                        <input type="text" class="form-control" id="middle_name">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="save_author_directory">Save</button>
            </div>
        </div>
    </div>
</div>

</@c.page>
