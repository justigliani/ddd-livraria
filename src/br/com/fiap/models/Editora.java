package br.com.fiap.models;

public class Editora {
   private String nome;
   public String site;
   public String telefone;

   //Métodos getters e setters
   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }

   public String getSite() {
      return site;
   }

   public void setSite(String site) {
      this.site = site;
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }
}
