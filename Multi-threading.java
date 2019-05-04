
• Java is a multi-threaded programming language which means that we can develop multi-threades program using Java.

• A mutli-threaded program contains two or more part that run concurrently and each part handle a different task at
  the same time making optimal use of the available resource specially when your computer has multiple CPUs.
  
  
  Life-cycle of Thread
  
              start() 
          New --------Runnable  
         -                   -   run()
       -    end of execution   - 
   Dead    -----------------       -Running 
        -                         -
          -                     -   sleep(),wait()
            -               - 
                 Waiting
