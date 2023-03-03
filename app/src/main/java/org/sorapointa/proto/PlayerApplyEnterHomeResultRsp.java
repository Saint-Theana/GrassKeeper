package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerApplyEnterHomeResultRsp {
    @Tag(tag=2) public Boolean isAgreed = null;
    @Tag(tag=11) public Integer applyUid = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer param = null;
}
