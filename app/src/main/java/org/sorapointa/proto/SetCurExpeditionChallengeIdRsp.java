package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetCurExpeditionChallengeIdRsp {
    @Tag(tag=14) public Integer id = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
