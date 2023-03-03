package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionPrivilegeInfo {
    @Tag(tag=7) public Integer curDayCount = null;
    @Tag(tag=10) public Integer totalCount = null;
    @Tag(tag=4) public Integer privilegeId = null;
}
