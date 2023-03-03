package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterMpResultRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Boolean isAgreed = null;
    @Tag(tag=10) public Integer applyUid = null;
    @Tag(tag=12) public Integer param = null;
}
