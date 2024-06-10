package school.hei.ratiocinator.affirmation;

import lombok.Getter;

@Getter
public abstract sealed class AffirmationComposee extends Affirmation permits Et, Ou, Donc {
  protected final Affirmation affirmation1;
  protected final Affirmation affirmation2;

  protected AffirmationComposee(Affirmation affirmation1, String conjonction, Affirmation affirmation2) {
    super(String.format("%s) %s (%s)", affirmation1.phrase, conjonction, affirmation2.phrase));
    this.affirmation1 = affirmation1;
    this.affirmation2 = affirmation2;
  }
}
