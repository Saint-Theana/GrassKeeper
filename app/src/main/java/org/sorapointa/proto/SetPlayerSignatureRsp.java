package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetPlayerSignatureRsp {
    @Tag(tag=1) public String signature = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
