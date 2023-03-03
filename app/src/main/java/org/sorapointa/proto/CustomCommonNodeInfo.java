package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CustomCommonNodeInfo {
    @Tag(tag=1,isSigned=true) public Integer parentIndex = null;
    @Tag(tag=2) public Integer configId = null;
    @Tag(tag=3) public String slotIdentifier = null;
}
