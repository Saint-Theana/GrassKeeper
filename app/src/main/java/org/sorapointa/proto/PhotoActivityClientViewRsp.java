package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PhotoActivityClientViewRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer posId = null;
}
