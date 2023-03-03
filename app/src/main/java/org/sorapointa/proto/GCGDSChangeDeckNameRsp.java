package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeDeckNameRsp {
    @Tag(tag=13) public Integer deckId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public String name = null;
}
