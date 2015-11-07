package com.amanda.Datos;

import java.sql.Date;

public class DatosFactura extends Datos{
    public int IdFactura, IdUsuario, IdProveedor, IdLimite;
    public String Numero;
    public Date Fecha;
    public double SumAlimentacion, SumEducacion, SumSalud, SumVestido, SumVivienda, SumOtros, SumGastosNegocio, TotalSinIVA, IVA, Total;
}
