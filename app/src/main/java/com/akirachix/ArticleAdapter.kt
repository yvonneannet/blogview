import com.akirachix.blogreaderapp.Article


class ArticleAdapter(var blogList : List<Article>):
    RecyclerView.Adapter<BlogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_list_item,parent,false)
        return BlogViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return blogList.size
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val blog = blogList[position]
        holder.tvTitle.text = blog.title
        holder.tvName.text = blog.authorName
        holder.tvSummary.text = blog.summary
        holder.tvDate.text = blog.publishingDate
    }
}
class BlogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvName = itemView.findViewById<TextView>(R.id.tvName)
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    val tvSummary= itemView.findViewById<TextView>(R.id.tvSummary)
}