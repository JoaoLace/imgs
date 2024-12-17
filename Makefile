# Define o nome da classe principal
MAIN_CLASS = main

# Remove arquivos .class antigos
clean:
	rm -f *.class

# Compila todos os arquivos .java
compile:
	javac *.java

# Executa o programa
run: compile
	java $(MAIN_CLASS)

# Limpa e compila novamente
rebuild: clean compile run
