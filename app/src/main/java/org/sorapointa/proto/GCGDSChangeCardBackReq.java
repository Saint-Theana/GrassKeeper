package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSChangeCardBackReq {
    @Tag(tag=10) public Integer deckId = null;
    @Tag(tag=12) public Integer cardBackId = null;
}
