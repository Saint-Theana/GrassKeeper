package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerNameRsp {
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public String nickName = null;
}
