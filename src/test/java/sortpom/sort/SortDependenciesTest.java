package sortpom.sort;

import org.junit.Test;
import sortpom.util.SortPomImplUtil;

public class SortDependenciesTest {

    @Test
    public final void scopeInSortDependenciesShouldSortByScope() throws Exception {
        SortPomImplUtil.create()
                .defaultOrderFileName("custom_1.xml")
                .sortDependencies("scope,groupId,artifactId")
                .lineSeparator("\r\n")
                .testFiles("/SortDep_input_simpleWithScope.xml", "/SortDep_expected_simpleWithScope2.xml");
    }

    @Test
    public final void defaultGroupIdForPluginsShouldWork() throws Exception {
        SortPomImplUtil.create()
                .defaultOrderFileName("custom_1.xml")
                .sortPlugins("groupId,artifactId")
                .lineSeparator("\n")
                .nrOfIndentSpace(4)
                .testFiles("/PluginDefaultName_input.xml", "/PluginDefaultName_expect.xml");
    }
}