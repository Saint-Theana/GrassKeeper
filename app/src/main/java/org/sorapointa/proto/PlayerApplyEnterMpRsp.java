package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer targetUid = null;
    @Tag(tag=4) public Integer param = null;
}
