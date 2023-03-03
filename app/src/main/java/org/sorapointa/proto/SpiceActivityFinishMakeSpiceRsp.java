package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpiceActivityFinishMakeSpiceRsp {
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Boolean isSuccess = null;
}
