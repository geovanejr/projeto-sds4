const DataTable = () => {
    return (
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes visitados</th>
                        <th>Negócios fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>22/04/2021</td>
                        <td>Barry Allen</td>
                        <td>34</td>
                        <td>25</td>
                        <td>15017.00</td>
                    </tr>
                    <tr>
                        <td>27/05/2021</td>
                        <td>Doutor Estranho</td>
                        <td>1</td>
                        <td>3</td>
                        <td>45800.00</td>
                    </tr>
                    <tr>
                        <td>27/05/2021</td>
                        <td>Capitão América</td>
                        <td>18</td>
                        <td>45</td>
                        <td>180000,00</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

export default DataTable;