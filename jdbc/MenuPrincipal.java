package br.modelo.jdbc;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		final Cd cd = new Cd();
		
				int continuar=1;
				do{
					System.out.println("MENU PRINCIPAL");
					System.out.println("1 - Cadastrar Cliente");
					System.out.println("2 - Mostrar Todos Cliente");
					System.out.println("3 - Selecionar Cliente");
					System.out.println("4 - Excluir Cliente");
					System.out.println("5 - Sair");
					System.out.print("Digite a opção desejada: ");
					int opcao = leitor.nextInt();
					
					switch(opcao){
						case 1:
							System.out.println("CADASTRAR CD");
							
							System.out.println("Disco: ");
							cd.setNomedocd(leitor.next());
							System.out.println("Gênero: ");
							cd.setGenero(leitor.next());
							System.out.println("Artista: ");
							cd.setArtista(leitor.next());

							CdDao.cadastrar(cd);

							leitor.close();
							System.out.println("Cd cadastrado!");
							break;
						case 2:
							System.out.println("*****************");
							System.out.println("MOSTRAR TODOS");
							System.out.println("*****************");
							break;
						case 3:
							System.out.println("*****************");
							System.out.println("SELECIONAR CLIENTE");
							System.out.println("*****************");
							break;
						case 4:
							System.out.println("*****************");
							System.out.println("EXCLUIR CLIENTE");
							System.out.println("*****************");
							break;
						case 5:
							System.out.println("*****************");
							System.out.println("PROGRAMA FINALIZADO!");
							System.out.println("*****************");
							System.exit(1);
					}
					
				}while(continuar!=5);
				
				leitor.close();
			}
		
	}
