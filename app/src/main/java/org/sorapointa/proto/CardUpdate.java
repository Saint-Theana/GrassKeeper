package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGCard.*;
import org.sorapointa.proto.GCGCard;

public class CardUpdate {
    @Tag(tag=10) public GCGCard card = null;
}
