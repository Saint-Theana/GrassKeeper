package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGTCInviteRsp {
    @Tag(tag=12) public Integer characterId = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
