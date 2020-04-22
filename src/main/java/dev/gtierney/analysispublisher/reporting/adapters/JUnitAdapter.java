package dev.gtierney.analysispublisher.reporting.adapters;

import edu.hm.hafner.analysis.parser.violations.AbstractViolationAdapter;
import se.bjurr.violations.lib.parsers.JUnitParser;

/**
 * Parses JUnit files.
 *
 * @author Gyanesha Prajjwal
 */
public class JUnitAdapter extends AbstractViolationAdapter {
  private static final long serialVersionUID = -1595503635554896281L;

  @Override
  protected JUnitParser createParser() {
    return new JUnitParser();
  }
}