package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GmTalkRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public String retmsg = null;
    @Tag(tag=13) public String msg = null;
}
