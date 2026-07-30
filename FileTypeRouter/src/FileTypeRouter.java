/*

Q70 — File Type Router

A file upload handler checks each file's extension to route it to the correct processor.

**Input:**

```
String[] filenames = {"report.pdf", "photo.JPG", "data.csv", "archive.tar.gz", "notes.txt"};
```

**Expected Output:**

```
report.pdf    → extension: pdf  → route to: DocumentProcessor
photo.JPG     → extension: jpg  → route to: ImageProcessor
data.csv      → extension: csv  → route to: SpreadsheetProcessor
archive.tar.gz → extension: gz  → route to: ArchiveProcessor
notes.txt     → extension: txt  → route to: TextProcessor
```

**Constraint:** Use `lastIndexOf(".")` — not `indexOf()` — to correctly handle filenames like `archive.tar.gz`. Convert extension to lowercase with `toLowerCase()`.
 */


public class FileTypeRouter {

    public static void main(String[] args) {


        String[] filenames = {"report.pdf", "photo.JPG", "data.csv", "archive.tar.gz", "notes.txt"};
        for (int i = 0 ; i<filenames.length; i ++){

            int ind = filenames[i].lastIndexOf(".");
            String filename = filenames[i].substring(ind+1);


            System.out.println(filename);

           //baghisho khodet dorost kon man hl nadaram

        }
    }
}
