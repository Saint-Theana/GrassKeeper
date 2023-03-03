package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeFieldRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer fieldId = null;
    @Tag(tag=2) public Integer deckId = null;
}
