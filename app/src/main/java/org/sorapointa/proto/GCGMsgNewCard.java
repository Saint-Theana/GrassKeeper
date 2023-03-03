package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGCard.*;
import org.sorapointa.proto.GCGCard;

public class GCGMsgNewCard {
    @Tag(tag=15) public GCGCard card = null;
}
