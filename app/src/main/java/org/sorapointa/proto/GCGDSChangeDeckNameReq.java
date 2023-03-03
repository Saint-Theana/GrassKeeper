package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeDeckNameReq {
    @Tag(tag=13) public Integer deckId = null;
    @Tag(tag=7) public String name = null;
}
