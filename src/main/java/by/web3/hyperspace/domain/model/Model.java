package by.web3.hyperspace.domain.model;

public class Model {
    private String id; //hf:acon96/Home-3B-v3-GGUF:Home-3B-v3.q4_k_m.gguf
    private String name; //Home-3B-v3-GGUF
    private String repository; //acon96
    private String ggufFile; //Home-3B-v3.q4_k_m.gguf
    private String uri; //https://huggingface.co/acon96/Home-3B-v3-GGUF
    private String fileURI; //https://huggingface.com/acon96/Home-3B-v3-GGUF/resolve/main/Home-3B-v3.q4_k_m.gguf
    private String hash; //https://huggingface.co/acon96/Home-3B-v3-GGUF

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getGgufFile() {
        return ggufFile;
    }

    public void setGgufFile(String ggufFile) {
        this.ggufFile = ggufFile;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getFileURI() {
        return fileURI;
    }

    public void setFileURI(String fileURI) {
        this.fileURI = fileURI;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
