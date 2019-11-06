<#import "../../parts/layout.ftl" as c>

<@c.page>
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
        <tr>
            <td>1</td>
            <td>Item 1</td>
            <td>
                <button class="btn btn-success">Edit</button>
            </td>
            <td>
                <button class="btn btn-danger">Delete</button>
            </td>
        </tr>
        <tr>
            <td>2</td>
            <td>Item 2</td>
            <td>
                <button class="btn btn-success">Edit</button>
            </td>
            <td>
                <button class="btn btn-danger">Delete</button>
            </td>
        </tr>
        </tbody>
    </table>
</@c.page>
