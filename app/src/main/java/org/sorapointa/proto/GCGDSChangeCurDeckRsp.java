package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCurDeckRsp {
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer deckId = null;
}
