import java.util.Scanner;

class SistemaDeLogin {

    // Usuário e senha armazenados
    private static final String usuarioCorreto = "admin";
    private static final String senhaCorreta = "98456";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nome de usuário
        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        // Solicitar senha
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        // Verificar se os dados estão corretos
        if (verificarLogin(usuario, senha)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
        }

        scanner.close();
    }

    // Função para verificar o login
    public static boolean verificarLogin(String usuario, String senha) {
        return usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta);
    }
}
