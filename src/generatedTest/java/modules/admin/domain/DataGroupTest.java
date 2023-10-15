package modules.admin.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class DataGroupTest extends AbstractDomainTest<DataGroup> {

	@Override
	protected DataGroup getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(DataGroup.MODULE_NAME, DataGroup.DOCUMENT_NAME);
	}
}