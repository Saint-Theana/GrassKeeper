package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionRecallRsp {
    @Tag(tag=1) public Integer pathId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
