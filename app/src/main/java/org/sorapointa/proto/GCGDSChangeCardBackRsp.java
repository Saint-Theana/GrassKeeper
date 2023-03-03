package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCardBackRsp {
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer cardBackId = null;
    @Tag(tag=5) public Integer deckId = null;
}
