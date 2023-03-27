package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionPrivilegeInfo {
    @Tag(tag=7) public Integer totalCount = null;
    @Tag(tag=12) public Integer privilegeId = null;
    @Tag(tag=8) public Integer curDayCount = null;
}
