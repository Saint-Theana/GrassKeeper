package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAuthkeyRsp {
    @Tag(tag=4) public String authAppid = null;
    @Tag(tag=15) public Integer signType = null;
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer authkeyVer = null;
    @Tag(tag=11) public String gameBiz = null;
    @Tag(tag=3) public String authkey = null;
}
