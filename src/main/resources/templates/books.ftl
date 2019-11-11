<#import "parts/layout.ftl" as c>

<@c.page>

    <h2>Books</h2>

    <div class="container-fluid">
        <div class="row">

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">Activity</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Activity</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">Author</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Author</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">Department</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Department</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">Format</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Format</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">Genre</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Genre</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">Keyword</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Keyword</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">Publisher</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Publisher</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">State</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">State</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>

            <div class="col-lg-4">
                <label class="sr-only" for="inlineFormInputGroup">Type</label>
                <div class="input-group mb-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text">Type</div>
                    </div>
                    <select class="form-control" id="inlineFormInputGroup">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                    </select>
                </div>
            </div>


            <#--            <#list directories as directory>-->
            <#--                <tr>-->
            <#--                    <td>${directory.id}</td>-->
            <#--                    <td id="name_${directory.id}">${directory.name!''}</td>-->
            <#--                    <td>-->
            <#--                        <button class="btn btn-success directory_edit" data-toggle="modal" data-target="#editModal" data-id="${directory.id}">Edit</button>-->
            <#--                    </td>-->
            <#--                    <td>-->
            <#--                        <a href="/directory/${path}/delete/${directory.id}" class="btn btn-danger">Delete</a>-->
            <#--                    </td>-->
            <#--                </tr>-->
            <#--            </#list>-->
        </div>
    </div>


</@c.page>
