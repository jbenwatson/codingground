public class GeneticCalculator {

	private int m_TargetNumber;
	
	private double m_MutationRate = 0.001;
	private double m_CrossOver = 0.7;
	private int m_MaxPopulation = 300;
	private int m_BytesPerGene = 1;
	private int m_ChromosomeGeneCount = 10;
	// One Chromosome will be 40 bits
	
	private Chromosome[] m_Population;
		
	
	public GeneticCalculator(
	  int a_TargetNumber
	) {
	  m_TargetNumber = a_TargetNumber;		
	}
	
	public void DoThing() {
	  // generate default population
	  GenerateDefaultPopulation(m_Population);
	  
	  int l_NumberOfGenerations = 1;
	  // loop until number found or exit
	  boolean l_HitTarget = false;
	  
	  while (l_HitTarget == false && l_NumberOfGenerations < 25) {
	  if (m_TargetNumber == Utils.Rand(1,m_TargetNumber*2)) {
		  l_HitTarget = true;
		  
	  }
	  l_NumberOfGenerations++;
	  }
	  
	  if (l_HitTarget == false) {
	    System.out.println("Unable to calculate soloution for " + m_TargetNumber + " after " + l_NumberOfGenerations + " generation(s).");
	  } else {
	    System.out.println("Target found after " + l_NumberOfGenerations + " generation(s).");
	  }
	}
	
	// Create default population
	private void GenerateDefaultPopulation(
	  Chromosome[] a_InitialPopluation
	) {
	  
	}
	
	private Chromosome CreateRandomChromosome() {
		Chromosome l_NewChrome = new Chromosome();
		for (int i=0; i<m_ChromosomeGeneCount; i++) {
			l_NewChrome.m_Genes[i] = (byte)Utils.Rand(0,13);// 0-9 then +-*/
		}
		return l_NewChrome;
	}

	// Mum is generated from Child1.Head + Child2.Tail at bit dictated by m_CrossOver
	private Chromosome CreateMumChromosome(
	  Chromosome a_Child1
	, Chromosome a_Child2
    ) {
		Chromosome l_NewChrome = new Chromosome();
		return l_NewChrome;	  
	}

	// Dad is generated from Child2.Head + Child1.Tail at bit dictated by m_CrossOver
	private Chromosome CreateDadChromosome(
	  Chromosome a_Child1
    , Chromosome a_Child2) {
		Chromosome l_NewChrome = new Chromosome();
		return l_NewChrome;		
	}
	
}
