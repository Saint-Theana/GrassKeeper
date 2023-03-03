package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MailTextContent {
    @Tag(tag=1) public String title = null;
    @Tag(tag=2) public String content = null;
    @Tag(tag=3) public String sender = null;
}
