public interface IMyList<T> {

    int size();	//dizideki eleman sayısını verir.
    int getCapacity();	//dizinin kapasite değerini verir.
    void add(T data); // sınıfa ait diziye eleman eklemek için kullanılmalıdır.
    //Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır. 
    
    T get(int index); //verilen indisteki değeri döndürür. Geçersiz indis girilerse 
    //null döndürür.
    
    T remove(int index); //verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı. 
    //Geçersiz indis girilerse null döndürür.
    
    T set(int index, T data); //verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. 
    //Geçersiz indis girilerse null döndürür.
    
    String toString(); //Sınıfa ait dizideki elemanları listeleyen bir metot.
    int indexOf(T data); //Parametrede verilen nesnenin listedeki indeksini verir. 
    //Nesne listede yoksa -1 değerini verir.
    
    int lastIndexOf(T data);//Belirtilen öğenin listedeki son indeksini söyler. 
    //Nesne listede yoksa -1 değerini verir.
    
    boolean isEmpty(); //Listenin boş olup olmadığını söyler.
    T[] toArray(); //Listedeki öğeleri, aynı sırayla bir array haline getirir.
    void clear(); //Listedeki bütün öğeleri siler, boş liste haline getirir.
    MyList<T> subList(int start, int finish);//Parametrede verilen indeks aralığına ait bir liste döner.
    boolean contains(T data); //Parametrede verilen değerin dizide olup olmadığını söyler.
}
