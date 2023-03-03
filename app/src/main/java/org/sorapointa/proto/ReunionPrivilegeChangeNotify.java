package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionPrivilegeInfo.*;
import org.sorapointa.proto.ReunionPrivilegeInfo;

public class ReunionPrivilegeChangeNotify {
    @Tag(tag=13) public ReunionPrivilegeInfo privilegeInfo = null;
}
