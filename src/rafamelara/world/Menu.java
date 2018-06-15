/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafamelara.world;

import Edificios.Entrenamiento;
import Edificios.GrupoQ;
import Edificios.RecolectarD;
import Edificios.RecolectarM;
import Edificios.RecolectarO;
import Milicia.Especialista;
import Milicia.Squad;
import Raza.Aliens;
import Raza.Elfos;
import Raza.Orcos;
import Recursos.recurso;
import Vehiculo.Caballos;
import Vehiculo.Coaster;
import java.util.Scanner;

/**
 *
 * @author Rafael Melara
 */
public class Menu {

    Orcos o;
    Caballos c;
    Coaster co;
    recurso re;
    Aliens al;
    Elfos elf;
    Squad sq;
    Especialista esp;
    Entrenamiento ent;
    GrupoQ gr;
    RecolectarD d;
    RecolectarM mt;
    RecolectarO or;

    public void menu() {
        Scanner leer = new Scanner(System.in);
        int opc;
        do {
            System.out.println("-----------------------");
            System.out.println("Bienvenido Escoga una Raza");
            System.out.println("1.Elfos");
            System.out.println("2.Orcos");
            System.out.println("3.Aliens");
            System.out.println("4.salir");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    int opcj = 0;
                    int turno;
                    while (opcj != 4) {
                        elf.Crear();
                        System.out.println("Menu raza elfos ");
                        System.out.println("1. Milicia");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir ");

                        opcj = leer.nextInt();

                        switch (opcj) {
                            case 1:
                                int m;
                                System.out.println("Bienvenido al cuartel que desea entrenar");
                                System.out.println("1.Especialista");
                                System.out.println("2.Esquadron");

                                m = leer.nextInt();

                                switch (m) {
                                    case 1:
                                        esp.entrenar();
                                        break;
                                    case 2:
                                        sq.entrenar();
                                        break;
                                }
                                break;
                            case 2:
                                int t;
                                System.out.println("Bienvenido a la tienda");
                                System.out.println("1.Reclector de oro");
                                System.out.println("2.recolector de diamante");
                                System.out.println("3.Recolector de metales");

                                t = leer.nextInt();

                                switch (t) {
                                    case 1:
                                        mt.crearEdificio();
                                    case 2:
                                        mt.crearEdificio();

                                    case 3:
                                        mt.crearEdificio();

                                }
                            case 3:
                                int y;
                                System.out.println("Bienvenido al centro de veiculos");
                                System.out.println("1.Caballos");
                                System.out.println("2.Carreta");

                                y = leer.nextInt();

                                switch (y) {
                                    case 1:
                                        c.crear();
                                        break;
                                    case 2:
                                        c.crear();
                                        break;

                                }
                                break;

                        }

                    }
                case 2:

                    int opcj2 = 0;
                    int turno2;
                    while (opcj2 != 4) {
                        elf.Crear();
                        System.out.println("Menu raza Orcos ");
                        System.out.println("1. Milicia");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir ");

                        opcj = leer.nextInt();

                        switch (opcj) {
                            case 1:
                                int m;
                                System.out.println("Bienvenido al cuartel que desea entrenar");
                                System.out.println("1.Especialista");
                                System.out.println("2.Esquadron");

                                m = leer.nextInt();

                                switch (m) {
                                    case 1:
                                        esp.entrenar();
                                        break;
                                    case 2:
                                        sq.entrenar();
                                        break;
                                }
                                break;
                            case 2:
                                int t;
                                System.out.println("Bienvenido a la tienda");
                                System.out.println("1.Reclector de oro");
                                System.out.println("2.recolector de diamante");
                                System.out.println("3.Recolector de metales");

                                t = leer.nextInt();

                                switch (t) {
                                    case 1:
                                        mt.crearEdificio();
                                    case 2:
                                        mt.crearEdificio();

                                    case 3:
                                        mt.crearEdificio();

                                }
                            case 3:
                                int y;
                                System.out.println("Bienvenido al centro de veiculos");
                                System.out.println("1.Caballos");
                                System.out.println("2.Carreta");

                                y = leer.nextInt();

                                switch (y) {
                                    case 1:
                                        c.crear();
                                        break;
                                    case 2:
                                       c.crear();
                                        break;
                                    
                                }
                                break;

                        }

                    }
                break;
                
                case 3:
                   
                    int opcj3 = 0;
                    int turno3;
                    while (opcj3 != 4) {
                        elf.Crear();
                        System.out.println("Menu raza Aliens ");
                        System.out.println("1. Milicia");
                        System.out.println("2. Edificaciones");
                        System.out.println("3. Vehiculos de guerra");
                        System.out.println("4. Salir ");

                        opcj = leer.nextInt();

                        switch (opcj) {
                            case 1:
                                int m;
                                System.out.println("Bienvenido al cuartel que desea entrenar");
                                System.out.println("1.Especialista");
                                System.out.println("2.Esquadron");

                                m = leer.nextInt();

                                switch (m) {
                                    case 1:
                                        esp.entrenar();
                                        break;
                                    case 2:
                                        sq.entrenar();
                                        break;
                                }
                                break;
                            case 2:
                                int t;
                                System.out.println("Bienvenido a la tienda");
                                System.out.println("1.Reclector de oro");
                                System.out.println("2.recolector de diamante");
                                System.out.println("3.Recolector de metales");

                                t = leer.nextInt();

                                switch (t) {
                                    case 1:
                                        mt.crearEdificio();
                                    case 2:
                                        mt.crearEdificio();

                                    case 3:
                                        mt.crearEdificio();

                                }
                            case 3:
                                int y;
                                System.out.println("Bienvenido al centro de veiculos");
                                System.out.println("1.Caballos");
                                System.out.println("2.Carreta");

                                y = leer.nextInt();

                                switch (y) {
                                    case 1:
                                        c.crear();
                                        break;
                                    case 2:
                                       c.crear();
                                        break;
                                    
                                }
                                break;

                        }

                    }    
                break;
            }

        } while (opc != 4);

    }

}
