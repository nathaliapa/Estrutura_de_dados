/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

/**
 *
 * @author nathalia
 */
public class ContaCorrente {
    
    private Integer codigo;
    private Integer agencia;
    private double saldo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(Double pValor){
        if(pValor<saldo){
            saldo=saldo-pValor;
        }
        
    }
    
    public void depositar(double pValor){
        if(pValor>0){
          saldo=saldo+pValor;  
        }
        
    }
    
    public void transferir (double pValor,double pContaDeposito){
        
         if(pValor<saldo){
            saldo=saldo-pValor;
            pContaDeposito=pValor+pContaDeposito;
            
        }
        
    }
    
}
