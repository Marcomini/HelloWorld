package principal;

import java.util.Scanner;

import br.modelo.jdbc.Alterar;
import br.modelo.jdbc.Cd;
import br.modelo.jdbc.CdDao;
import br.modelo.jdbc.MostrarTudo;
import br.modelo.jdbc.Remover;

public class MenuPrincipal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		final Cd cd = new Cd();
		
				int continuar=1;
				do{
					System.out.println("MENU PRINCIPAL");
					System.out.println("1 - Cadastrar");
					System.out.println("2 - Alterar  ");
					System.out.println("3 - Mostrar");
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
							
							System.out.println("ALTERAR CD");
							
							System.out.println("Código:");
							cd.setCodigo (leitor.nextInt());
							System.out.println("Disco: ");
							cd.setNomedocd(leitor.next());
							System.out.println("Gênero: ");
							cd.setGenero(leitor.next());
							System.out.println("Artista: ");
							cd.setArtista(leitor.next());
							
							Alterar.alterando(cd);
							
							leitor.close();
							System.out.println("Alterado com sucesso!");
							break;
						case 3:
							System.out.println("Mostrar CD");
								MostrarTudo.mostrando();
								
							break;
						case 4:
							System.out.println("EXCLUIR CD");
														
							System.out.println("Código:");
							int codigo = leitor.nextInt();
							
							Remover.removendo(codigo);
							
							break;
						case 5:
							System.out.println("PROGRAMA FINALIZADO!");
							System.exit(1);
					}
					
				}while(continuar!=5);
				
				leitor.close();
			}
		
	}
