package sistemaDistribuido.visual.Alex;

import sistemaDistribuido.sistema.clienteServidor.Alex.ProcesoServidor;
import sistemaDistribuido.visual.clienteServidor.MicroNucleoFrame;
import sistemaDistribuido.visual.clienteServidor.ProcesoFrame;

public class ServidorFrame extends ProcesoFrame{
  private static final long serialVersionUID=1;
  private ProcesoServidor proc;

  public ServidorFrame(MicroNucleoFrame frameNucleo){
    super(frameNucleo,"Servidor de Archivos ALEX");
    proc=new ProcesoServidor(this);
    fijarProceso(proc);
  }
}