package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusRenameRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer fungusId = null;
    @Tag(tag=12) public Integer nameId = null;
}
