<#import "../parts/layout.ftl" as c>

<script src="/static/js/directory/directory.js" defer></script>

<@c.page>

    <h2>${name}</h2>

    <button class="btn btn-primary mb-3 directory_edit" data-toggle="modal" data-target="#editModal" data-id="0">Create</button>

    <table data-toggle="table">
        <thead>
        <tr>
            <th data-width="100">Id</th>
            <th>Name</th>
            <th data-width="100">Edit</th>
            <th data-width="100">Delete</th>
        </tr>
        </thead>
        <tbody>
        <#list directories as directory>
            <tr>
                <td>${directory.id}</td>
                <td id="name_${directory.id}">${directory.name!''}</td>
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
                        <div class="form-group">
                            <label for="name" class="col-form-label">Name:</label>
                            <input type="text" class="form-control" id="name">
                            <input type="hidden" id="id">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" id="save_directory">Save</button>
                </div>
            </div>
        </div>
    </div>

</@c.page>
