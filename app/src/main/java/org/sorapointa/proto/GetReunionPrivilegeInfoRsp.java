package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionPrivilegeInfo.*;
import org.sorapointa.proto.ReunionPrivilegeInfo;

public class GetReunionPrivilegeInfoRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public ReunionPrivilegeInfo privilegeInfo = null;
}
