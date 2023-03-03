package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAuthkeyReq {
    @Tag(tag=14) public String authAppid = null;
    @Tag(tag=7) public Integer signType = null;
    @Tag(tag=13) public Integer authkeyVer = null;
}
