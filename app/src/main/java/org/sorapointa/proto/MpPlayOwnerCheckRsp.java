package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayOwnerCheckRsp {
    @Tag(tag=4) public Integer wrongUid = null;
    @Tag(tag=15) public Boolean isSkipMatch = null;
    @Tag(tag=10) public Integer mpPlayId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
